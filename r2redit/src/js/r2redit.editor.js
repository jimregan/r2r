/*
 *  Copyright (c) 2011, MediaEvent Services GmbH & Co. KG
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * @fileOverview R2R edit capabilities
 * @author Christian Becker
 */
(function($){
	var treeViewTypes = [];
	
	/** 
	 * Represents an R2R tree object
	 * @param container The treeview
	 * @param obj rdfQuery object to represent
	 */
	$.r2rTreeViewObject = $.inherit({

		__constructor: function(obj){
			this.obj = obj;
			this.init();
	        return this;
		},
	
		init: function() {
			var base = this;
			this.el = $("<li></li>")
						.data("r2rObject", this);
			if (this.isVisible()) {
				$("<span></span>")
					.addClass(this.getClass())
					.addClass("r2redit-mappingTableClickable")
					.attr("title", this.getTooltip())
					.html(this.getLabel())
					.click(function() {
						base.getEditor().show();
					})
					.appendTo(this.el);
				$("<span></span>")
					.addClass("ui-icon-minus-small-circle")
					.addClass("r2redit-mappingTableClickable")
					.click(function() {
						base.remove();
					})
					.appendTo(this.el);
			} else {
				this.el.hide();
			}
		},
		addToTreeView: function(treeview) {
			treeview
				.append(this.el)
				.treeview({add: this.el});
			this.treeview = treeview;
		},
		removeFromTreeView: function() {
			if (this.treeview) {
				this.treeview.treeview({remove: this.el});
			}
		},
		remove: function() {
			this.removeFromTreeView();
			this.el.remove();
		},
		refresh: function() {
			if (!this.isVisible()) {
				return;
			}
			this.el.find("span:first").html(this.getLabel());
		},
		getClass: function() {
		},
		getUnderlyingObject: function() {
			return this.obj;
		},
		setUnderlyingObject: function(obj) {
			this.obj = obj;
		},
		getLabel: function() {
		},
		getTooltip: function() {
		},
		/**
		 * Treeview objects are usually visible, but we might want to include some information
		 * that is not directly modifiable, such as the mapping type
		 */
		isVisible: function() {
			return true;
		},
		/**
		 * Helper method to allow us to invoke the static method getProperty()
		 * on instances
		 */
		getProperty: function() {
			return this.__self.getProperty();
		}
	}, {
		getProperty: function() {
		}
	});
	
    /** 
	 * Represents an rdf:type definition (invisible)
	 */
	$.r2rTreeViewType = $.inherit(
		$.r2rTreeViewObject,
		{
			isVisible: function() {
				return false;
			}
		}, {
			getProperty: function() {
				return "rdf:type";
			}
		}
	);		
	treeViewTypes.push($.r2rTreeViewType);
	
    /** 
	 * Represents an r2r:mappingRef definition (invisible)
	 */
	$.r2rTreeViewMappingRef = $.inherit(
		$.r2rTreeViewObject,
		{
			isVisible: function() {
				return false;
			}
		}, {
			getProperty: function() {
				return "r2r:mappingRef";
			}
		}
	);		
	treeViewTypes.push($.r2rTreeViewMappingRef);
	
	/** 
	 * Represents a prefix definitions element in the treeview
	 */
	$.r2rTreeViewPrefixDefinitions = $.inherit(
		$.r2rTreeViewObject,
		{
			getClass: function() {
				return "ui-icon-colon";
			},
			getTooltip: function() {
				return "Prefix Definitions";
			},
			getLabel: function() {
				if (this.obj === undefined) {
					return "(error)";
				}
				
				var prefixes = $.r2rUtils.parsePrefixDefinitions(this.getUnderlyingObject().value);
				var label = "";
				$.each(prefixes, function(key, value) {
					label += (label != "" ? ", " : "") + key;
				});
				
				return label;
			},
			getEditor: function() {
				return new $.r2rStringEditor(this);
			}
		}, {
			getProperty: function() {
				return "r2r:prefixDefinitions";
			}
		}
	);
	treeViewTypes.push($.r2rTreeViewPrefixDefinitions);

    /** 
	 * Represents a source pattern in the treeview
	 */
	$.r2rTreeViewSourcePattern = $.inherit(
		$.r2rTreeViewObject,
		{
			getClass: function() {
				return "ui-icon-block-arrow-in";
			},
			getTooltip: function() {
				return "Source Pattern";
			},
			getLabel: function() {
				return (this.obj !== undefined ? this.obj.value : '(error)');
			},
			getEditor: function() {
				return new $.r2rStringEditor(this);
			}
		}, {
			getProperty: function() {
				return "r2r:sourcePattern";
			}
		}
	);	
	treeViewTypes.push($.r2rTreeViewSourcePattern);
		
    /** 
	 * Represents a target pattern in the treeview
	 */
	$.r2rTreeViewTargetPattern = $.inherit(
		$.r2rTreeViewObject,
		{
			getClass: function() {
				return "ui-icon-block-arrow";
			},
			getTooltip: function() {
				return "Target Pattern";
			},
			getLabel: function() {
				return (this.obj !== undefined ? this.obj.value : '(error)');
			},
			getEditor: function() {
				return new $.r2rStringEditor(this);
			}
		}, {
			getProperty: function() {
				return "r2r:targetPattern";
			}
		}
	);	
	treeViewTypes.push($.r2rTreeViewTargetPattern);

    /** 
	 * Represents a transformation in the treeview
	 */
	$.r2rTreeViewTransformation = $.inherit(
		$.r2rTreeViewObject,
		{
			getClass: function() {
				return "ui-icon-arrow-transition";
			},
			getTooltip: function() {
				return "Transformation";
			},
			getLabel: function() {
				return (this.obj !== undefined ? this.obj.value : '(error)');
			},
			getEditor: function() {
				return new $.r2rStringEditor(this);
			}
		}, {
			getProperty: function() {
				return "r2r:transformation";
			}
		}
	);
	treeViewTypes.push($.r2rTreeViewTransformation);
	
	/**
	 * Generates editor chrome for a given single mapping
	 * @param container jQuery element to host the table / editor
	 * @param rdfStore An rdfQuery store containing the mapping definitions
	 * @param mapping The URI of the mapping to edit, or null to create a new mapping
	 * @param parentMapping When creating a new property mapping, specifies the parent class mapping
	 * @param onComplete Callback to invoke when editing has finished, adhering to the following interface:
	 * 	function(mapping, originalMapping, rdfRepresentation)
	 *		@param mapping The URI of the mapping that was edited
	 *		@param originalMapping The original URI of the mapping that was edited - this will differ from mapping if the user renamed it
	 *		@param rdfRepresentation An rdfStore containing the RDF representation of the mapping. If the item was removed, the value is null.
	 * 		@param action One of "save", "remove", "cancel"
	 */
	$.r2rEditorMappingEditor = function(container, rdfStore, mapping, parentMapping, onComplete) {
		var base = this;
		base.container = container;
		base.rdfStore = rdfStore;
		base.rdfRepresentation = $.rdf();
		base.mapping = base.originalMapping = mapping;
		base.parentMapping = parentMapping;
		base.onComplete = onComplete;
		
		base.init = function() {
			base.initUI();
			base.importData();
		};
		
		base.initUI = function() {
			/* Main chrome */
			base.editor = $("<div>\
							<h1>" + (mapping ? "Edit " :"New ") + (parentMapping ? "Property Mapping" : "Class Mapping") + "</h1>\
							</div>")
							.addClass("r2redit-editor")
							.appendTo(container);
			/* Tabs */
			base.tabs = $("<div>\
				<ul>\
					<li><a href=\"#tree\">Mapping Tree</a></li>\
					<li><a href=\"#sourceCode\">Mapping Source</a></li>\
				</ul>\
			</div>")
			.appendTo(base.editor);
			
			/* Tree view */
			base.treeTab = $("<div id=\"tree\">\
					<div id=\"r2redit-controlbar\" class=\"ui-widget-content ui-corner-all\">\
					</div>\
					<input type=\"text\" id=\"r2redit-mappingName\" title=\"Please enter a full or prefixed URI\">\
				</div>")
				.appendTo(base.tabs);
				
			$("#r2redit-mappingName").change(function() {
				try {
					base.mapping = $.rdf.resource($("#r2redit-mappingName").val(), { namespaces: base.rdfStore.databank.namespaces });
				}
				catch(err) {
				}
			}).focus(function() {
				this.select();				
			});
				
			/* Controls */
			$.each({
				"Prefix Definitions": {
					icon: "ui-icon-colon",
					objectClass: $.r2rTreeViewPrefixDefinitions
				},
				"Source Pattern": {
					icon: "ui-icon-block-arrow-in",
					objectClass: $.r2rTreeViewSourcePattern
				},
				"Target Pattern": {
					icon: "ui-icon-block-arrow",
					objectClass: $.r2rTreeViewTargetPattern
				},
				"Transformation": {
					icon: "ui-icon-arrow-transition",
					objectClass: $.r2rTreeViewTransformation
				}
			}, function(key, options) {	
				base.treeTab.find("#r2redit-controlbar").append($("<div></div>")
						.button({
				            icons: {
				                primary: options.icon
				            },
				            label: key,
						})
						.click(function() {
							var f = new options.objectClass($.r2rUtils.createStringLiteral(""));
							f.getEditor().show(function() {
								f.addToTreeView(base.treeview);
							});
						})
					);
			});
			
			/* Treeview */
			base.treeview = $("<ul></ul>")
				.appendTo(base.treeTab)
				.treeview();
							
			base.editor.append(
				$("<div></div>")
				.attr("id", "r2redit-bottomPane")
				.addClass("ui-widget")
				.addClass("ui-widget-content")
				.addClass("ui-corner-bottom")
				.append($("<div></div>")
					.button({
			            label: "Save",
					})
					.click(function() {
						base.close("save");
					})
				)
				.append($("<div></div>")
					.button({
			            label: "Remove",
					})
					.click(function() {
						var dialog = $("<div class=\"r2redit-dialog\" title=\"Remove Mapping\">\
										<p>\
										<span class=\"ui-icon ui-icon-alert\"></span>\
										Are you sure?" + (base.parentMapping ? "" : " This will also remove all related property mappings.") + "\
										</p>\
										</div>");
						dialog.dialog({
							autoOpen: true,
							height: 150,
							width: 300,
							modal: true,
							buttons: {
								"Remove": function() {
									/**
									 * Workaround: This gets called once on initialization... seems to be a jQuery UI bug
									 */
									if (!dialogOpened) {
										return;
									}
									$(this).dialog("close");
									base.close("remove");
								},
								"Cancel": function() {
									/**
									 * Workaround: This gets called once on initialization... seems to be a jQuery UI bug
									 */
									if (!dialogOpened) {
										return;
									}
									$(this).dialog("close");
								}
							}
						});
						var dialogOpened = true;
						$.r2rUI.fixJQueryUIDialogButtons(dialog);
					})
				)
				.append($("<div></div>")
					.button({
			            label: "Cancel",
					})
					.click(function() {
						base.close("cancel");
					})
				)
			);

			/* Source code view */
			base.soureCodeTab = $("<pre id=\"sourceCode\"></pre>")
				.appendTo(base.tabs);
			base.tabs.tabs({
				selected: 0,
				show: function(event, ui) {
					if (ui.index == 1) {
						base.generateRdfRepresentation();
						$("#sourceCode").text(base.rdfRepresentation.databank.dump({format:'text/turtle', serialize: true, indent: true}));									}
				}
			}).removeClass("ui-corner-all");
			/* Init qTips */
			base.editor.find("[title]").qtip({
				position: {
					corner: {
						target: "rightMiddle",
						tooltip: "leftMiddle"
					}
				},
				style: {
					background: '#feff9d',
					border: {
						width: 1,
						radius: 3,
						color: '#feff9d'
					},
					padding: 3, 
					textAlign: 'left',
					fontSize: '12px',
					tip: true, // Give it a speech bubble tip with automatic corner detection
					name: 'cream' // Style it according to the preset 'cream' style
				}
			});
		}
		
		base.importData = function() {
			if (base.mapping === null) {
				/* new mapping */
				var basePrefixStore = $.r2rUtils.basePrefixStore();				
				if (base.parentMapping) {
					new $.r2rTreeViewType($.rdf.resource("r2r:PropertyMapping", { namespaces: basePrefixStore.databank.namespaces })).addToTreeView(base.treeview);
					new $.r2rTreeViewMappingRef(base.parentMapping).addToTreeView(base.treeview);
				} else {
					new $.r2rTreeViewType($.rdf.resource("r2r:ClassMapping", { namespaces: basePrefixStore.databank.namespaces })).addToTreeView(base.treeview);
				}
				base.editor.find("#r2redit-mappingName").val("(please provide a name)");
				return;
			}
			
			/* Mapping URI */
			base.editor.find("#r2redit-mappingName").val($.r2rUtils.formatResource(base.mapping, base.rdfStore.databank.namespaces));
			
			/* Parse data */
			$(treeViewTypes).each(function(key, obj) {
				var objects = $.r2rUtils.findObjects(base.rdfStore, base.mapping, obj.getProperty());
				$(objects).each(function(key, value) {
					new obj(value).addToTreeView(base.treeview);
				});
			});
		},
		
		/**
		 * Popuplates rdfRepresentation object based on mappingObjects
		 */
		base.generateRdfRepresentation = function() {
			base.rdfRepresentation = $.rdf({namespaces: base.rdfStore.databank.namespaces});
			base.treeview.find("li").each(function(key, obj) {
				var mappingObject = $(obj).data("r2rObject");
				base.rdfRepresentation.add(
					$.rdf.triple(
						base.mapping,
						$.rdf.resource(mappingObject.getProperty(), { namespaces: base.rdfRepresentation.databank.namespaces }),
						mappingObject.getUnderlyingObject()
					)
				);
			});
		};
		
		base.close = function(action) {
			if (base.onComplete && action=="save") {
				base.generateRdfRepresentation();
			}
			base.treeview.find("li").remove();
			base.editor.remove();
			if (base.onComplete) {
				base.onComplete(base.mapping, base.originalMapping, base.rdfRepresentation, action);
			}
		};
		
		base.remove = function() {
			if (base.editor) {
				base.editor.remove();
			}
		}

        base.init();
        return base;
	};
	
	/** 
	 * Base value editor class
	 */
	$.r2rValueEditor = $.inherit({

		__constructor: function(obj){
			this.obj = obj;
			this.init();
	        return this;
		},
	
		init: function() {
		},
		
		getObject: function() {
			return this.obj;
		},
		
		show: function(onSave) {
			var base = this;
			var dialogOpened = false;
			var dialog = $("<div></div>")
				.addClass("r2redit-dialog")
				.attr("title", this.obj.getTooltip())
				.append($("<form></form>")
					.append($("<fieldset></fieldset>")
						.append(this.getFields()))
				);
			dialog.dialog({
				autoOpen: true,
				height: 300,
				width: 350,
				modal: true,
				buttons: {
					Save: function() {
						/**
						 * Workaround: This gets called once on initialization... seems to be a jQuery UI bug
						 */
						if (!dialogOpened) {
							return;
						}
						base.save();
						$(this).dialog("close");
						if (onSave) {
							onSave();
						}
					},
					"Cancel": function() {
						/**
						 * Workaround: This gets called once on initialization... seems to be a jQuery UI bug
						 */
						if (!dialogOpened) {
							return;
						}
						$(this).dialog("close");
					}
				},
				close: function() {
				}
			});
			var dialogOpened = true;
			$.r2rUI.fixJQueryUIDialogButtons(dialog);
		},
		
		/**
		 * Override to add fields to edit form
		 */
		getFields: function() {
		},
		save: function() {
		}
	});
	
    /** 
	 * Represents a string editor
	 */
	$.r2rStringEditor = $.inherit(
		$.r2rValueEditor,
		{
			getFields: function() {
				this.valueField = $("<textarea></textarea>").val(this.obj.getUnderlyingObject().value);
				return $("<label for=\"textfield\">String value</label>").append(this.valueField);
			},
			save: function() {
				this.obj.setUnderlyingObject($.r2rUtils.createStringLiteral(this.valueField.val()));
				this.obj.refresh();
			}
		}
	);	

})(jQuery);
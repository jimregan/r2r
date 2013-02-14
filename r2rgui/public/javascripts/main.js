/** Initialization */
$(function() {
  $("button[type!='radio'], input:submit, input:checkbox, a.button").button();
});

/** Gets the HTML from a specified path and displays it as a dialog. */
function showDialog(path) {
  $.get(path, function(data) {
    $('#dialogContainer').html(data);
  }).fail(function(request) { alert(request.responseText);  })
}

/** Commits the contents of the mapping text area. */
function updateMapping() {
  $.ajax({
    url: "/api/mapping",
    type: 'put',
    contentType: 'text/plain',
    data: $('#mapping').val(),
    processData: false
  });
}
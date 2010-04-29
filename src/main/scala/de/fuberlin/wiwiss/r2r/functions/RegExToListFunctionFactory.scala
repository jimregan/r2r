package de.fuberlin.wiwiss.r2r.functions

import de.fuberlin.wiwiss.r2r._
import java.util.List
import java.util.ArrayList

class RegExToListFunctionFactory extends FunctionFactory {
	private val function = new RegExToListFunction()
	def getInstance(): Function = {
	  function
	}
 
	private class RegExToListFunction() extends Function {
	  def getURI(): String = {
	     "regexToList"
	  }

	  def execute(arguments: List[List[String]], hint: String): List[String] = {
	    val regex = arguments.get(0).get(0)
	    val workString = arguments.get(1).get(0)
            val resultList: java.util.List[String] = new ArrayList[String]();
     
            val re = regex.r
            workString match {
              case re(contents @ _* ) => for(element <- contents.toList)
                                              resultList.add(element)
                                         resultList
              case _ => resultList 
            }
	  }
	}
}

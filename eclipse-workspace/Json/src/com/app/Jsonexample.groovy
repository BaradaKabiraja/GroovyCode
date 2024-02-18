package com.app

		// TODO Auto-generated method stub
		@Grab(group='org.codehaus.groovy',module='groovy-json',version='3.0.9')
		
		import groovy.json.JsonSlurper
		
		import groovy.json.JsonOutput
		
		def filePath = "src/com/app/data.json"
		

		
		def readJson(filePath) {
		
		    def file = new File(filePath)
		
		    if (file.exists()) {
		
		        def jsonSlurper = new JsonSlurper()
		
		        return jsonSlurper.parse(file)
		
		    } else {
		
		        println "File not found: $filePath"
		
		        return null
		
		    }
		
		}
		
		 
		
		 
		
		def updateJson(filePath, keyToUpdate, newValue) {
		
		    def file = new File(filePath)
		
		    if (file.exists()) {
		
		        def jsonSlurper = new JsonSlurper()
		
		        def jsonData = jsonSlurper.parse(file)
		
		        
		
		        // Update the specific key
		
		        jsonData[keyToUpdate] = newValue
		
		        //jsonData.remove("city") // removes a field
		
		        // jsonData.put("country", "UK") // add a new field
		
		        // Write the updated JSON data back to the file
		
		        def jsonOutput = new JsonOutput()
		
		        //def updatedJson = jsonOutput.toJson(jsonData)
		
		        def updatedJson = jsonOutput.prettyPrint(jsonOutput.toJson(jsonData))
		
		        //updatedJson = JsonOutput.prettyPrint(JsonOutput.toJson(jsonData))
		
		        file.write(updatedJson)
		
		        
		
		        println "Key '$keyToUpdate' updated to '$newValue' in JSON file."
		
		    } else {
		
		        println "File not found: $filePath"
		
		    }
		
		}
		
		 
		
		// Update the 'city' key in JSON
		
		updateJson(filePath, 'city', 'New York')
		
		 
		
		def jsonData = readJson(filePath)
		
		if (jsonData) {
		
		    for (entry in jsonData) {
		
		        println(entry.key + ' ' + entry.value)
		
		    }
		
		}
		
		else {
		
		    println("Nothing to display")
		
		}
		
		 
		
		 
		
		Create a file data.json with the following content.
		
		{
		
		    "name": "John Wick",
		
		    "age": 40,
		
		    "city": "New York",
		
		    "email": "john.wick@example.com"
		
		}
		
		 
		
	}
}

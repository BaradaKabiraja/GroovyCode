package map

class Mapexample {

	static void main(args) {
		// TODO Auto-generated method stub
		def myMap = [
			"name" :"kabir",
			"age":30,
			"city":"Warsawa"
			]
			
			println ("name $myMap.name")
			
			myMap.putAt("county", "Poland")
			println("county: $myMap")
			myMap.remove("age")
			println("county: $myMap")
		    
			def keytocheck ="kabir"
			
			if (myMap.containsKey(keytocheck))
				println("name contains :$keytocheck")
			else 
				println("no matching key")
	}
}

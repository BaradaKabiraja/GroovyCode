package com.app

class Switchcase {

	static void main(args) {
		// TODO Auto-generated method stub
		 def name = "Bonnie"
                switch(name) {
                        case "Sherlock":
                                println("Watson")
                                break
                        case "Bonnie":
                            println("Clyde")
                                break
                        case "Jekyll":
                            println("Hyde")
                                break
                        default:
                                println("No conditions matched")
                                break
                }
        }
}

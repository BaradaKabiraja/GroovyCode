package com.app
class Listadd{
        static void main(args) { 

                // TODO Auto-generated method stub 

                def myList = [1, 2, 3, 4, 5] 
              
                // Accessing elements of a list 

                println("First element: ${myList[0]}") 

                println("Third element: ${myList[2]}") 
               
                // Adding elements to a list 

                myList.add(6) 

                println("List after adding 6: $myList") 
              
               // Removing elements from a list 

                myList.remove(3) 

                println("List after removing 3: $myList") 

                 

                // Iterating over a list 

                println("Iterating over the list:") 

                println("Iterating over the list using a for loop:") 

                for (int i = 0; i < myList.size(); i++) { 

                        println("Element at index $i: ${myList[i]}") 

                } 

                 

                // Checking if a list contains an element 

                def element = 4 

                if (myList.contains(element)) { 

                        println("List contains $element") 

                } else { 

                        println("List does not contain $element") 

                } 

                 

                // Finding the size of a list 

                println("Size of the list: ${myList.size()}") 

                 

                // Adding element at a specific position 

                def elementToAdd = 4 

                def indexToAddAt = 3 

                 

                myList.add(indexToAddAt, elementToAdd) 

                 

                println(myList) 

        } 

} 
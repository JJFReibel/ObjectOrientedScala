/*
MIT License

Copyright (c) 2020 Jean-Jacques François Reibel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

class Car(var wheels: Integer, var doors: Integer, var cylinders: Integer){
    this.wheels = wheels
    this.doors = doors
    this.cylinders = cylinders

    def addWheels(wheels: Integer): Unit = {
      this.wheels = this.wheels + wheels
    }

    def addDoors(doors: Integer): Unit = {
      this.doors = this.doors + doors
    }

    def addCylinder(cylinders: Integer): Unit = {
      this.cylinders = this.cylinders + cylinders
    }

    def deleteWheels(wheels: Integer): Unit = {
      this.wheels = this.wheels - wheels
    }

    def deleteDoors(doors: Integer): Unit = {
      this.doors = this.doors - doors
    }

    def deleteCylinder(cylinders: Integer): Unit = {
      this.cylinders = this.cylinders - cylinders
    }
}

object Main {
  def main(args: Array[String]): Unit = {
    System.out.println("Creating car.")
    var subaru = new Car(4, 4, 4)
    System.out.println("Adding wheel directly to car object.")
    subaru.wheels = 5
    System.out.println("Wheels check: " + subaru.wheels)
    System.out.println("Doors check: " + subaru.doors)
    System.out.println("Cylinders check: " + subaru.cylinders)
    System.out.println("")
    System.out.println("Removing wheel using class method.")
    subaru.deleteWheels(1)
    System.out.println("Wheels check: " + subaru.wheels)
    System.out.println("Doors check: " + subaru.doors)
    System.out.println("Cylinders check: " + subaru.cylinders)
    System.out.println("")
  }
}

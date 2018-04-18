/* To compile this from proj3
javac -d proj2/classes1 -cp proj1/classes proj2/src2/mypac2/ComplexExecution.java
To run
java -cp proj2/classes:proj1/classes mypac2.ComplexExecution
*/
package mypac2;
import mypac.Complex;
class ComplexExecution {
	public static void main(String args[]) {
		Complex temp = new Complex(3,4);
		System.out.println(temp);
	}
}

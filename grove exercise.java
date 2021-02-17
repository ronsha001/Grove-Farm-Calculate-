

public class Calculator_Test {

	public static void main(String[] args) {
		
		int[] grove = new int [150]; // 150 Trees in grove
		int orrangesWeight = 0, weight, juiceProduce, treeWeight = 0;
		double juice = 0;
		for (int i = 0; i < grove.length; i++) {
			grove[i] = (int)(Math.random()*201+200); // Each tree contain 200-400 orranges
			treeWeight = 0;
			for (int j = 0; j < grove[i]; j++) {
				weight = (int)(Math.random()*201+100); // Each orrange weights 100-300 gram
				orrangesWeight += weight; // Sum of grove's weight
				treeWeight += weight; // Tree weight
			}
			juice = (treeWeight/1000) / 3; // The amount of juice a tree produces is a third of its weight
			System.out.println("Tree {"+(i+1)+"} with "+grove[i]+" orranges, can produce "+juice+" Litters.");
			juice = 0;
		}
		int highestOrranges = 0, index = 0;
		for (int i = 0; i < grove.length; i++) { // Finding the tree with the most orranges
			if (highestOrranges < grove[i]) {
				highestOrranges = grove[i];
				index = i+1;
			}
		}
		System.out.println("The tree with the most orranges: Tree {"+index+"}, with "+highestOrranges+" orranges."); // Printing tree with the most orranges
		System.out.println("Total grove weight: "+(orrangesWeight/1000000.0)+" Tons"); // Printing total grove weight in tons
	}

}

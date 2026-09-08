
void main() {

	// TODO Ctrl+hover > Open in new Editor
	printJavaVendorInfo();

}







void printJavaVendorInfo() {
	var props = System.getProperties().entrySet();

	// TODO New quick assist: Convert Enhanced 'for' loop to 'forEach'

	for (var p : props) {
		if (p.getKey().toString().contains("vendor")) {
			IO.println(p);
		}
	}

}
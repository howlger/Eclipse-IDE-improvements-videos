// @ts-check

// Checks for super Property Accesses on Instance Fields
class Base {
    fn = () => console.log("function called");
	
	method() {
		console.log("method() called");
	}
}
class Derived extends Base {
    someOtherMethod() {
        super.fn(); // overlooked error in the past
    }
}


// Preserved Narrowing in Closures Following Last Assignments
/**
 * @param {string|URL} url
 * @param {string[]} names
 */
function getUrls(url, names) {
//    if (typeof url === "string") {
//        url = new URL(url);
//    }

    return names.map(function(name) {
		url.searchParams.set("name", name)
		//  ~~~~~~~~~~~~
		//  ⚠ Property 'searchParams' does not exist on type 'string | URL'.

		return url.toString();
    });
}
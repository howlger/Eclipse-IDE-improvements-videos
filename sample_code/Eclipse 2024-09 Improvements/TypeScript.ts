// Control flow narrowing for constant indexed accesses
function f1(obj: Record<string, unknown>, key: string) {
    if (typeof obj[key] === "string") {
        obj[key].toUpperCase(); // now okay, previously was error
    }
}

// Regular expression syntax checking
const stringListRegex = /(("[^"]*")(,\s*)?)+)/;
const markdownCodeRegex = /(`+).*?\2/;

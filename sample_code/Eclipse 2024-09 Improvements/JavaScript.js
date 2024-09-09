// @ts-check

/**
 * @param {Record<string, unknown>} obj
 * @param {string} key
 */
function f1(obj, key) {
    if (typeof obj[key] === "string") {
        obj[key].toUpperCase(); // now okay, previously was error
    }
}

// Regular expression syntax checking
const stringListRegex = /(("[^"]*")(,\s*)?)+)/;
const markdownCodeRegex = /(`+).*?\2/;

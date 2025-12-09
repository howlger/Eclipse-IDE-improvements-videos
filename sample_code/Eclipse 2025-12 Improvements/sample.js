// @ts-check

// Granular checks for branches in return expressions

/**
 * @param {string|undefined} urlString
 * @param {URL} defaultUrl
 * @returns {URL}
 */
function getUrlObject(urlString, defaultUrl) {
    return urlString === undefined ?
        defaultUrl :
        urlString;
}
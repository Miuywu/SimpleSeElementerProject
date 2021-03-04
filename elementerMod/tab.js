;(function(document) {
  /**
   * Click action for hovered element
   */
  function tabOnClick(e) {
    // These are the default actions (the XPath code might be a bit janky)
    // Really, these could do anything:
    // console.log( cssPath(e.target) );
    chrome.extension.sendMessage({
      type: "tab",
      url: "test"
    })
    /* console.log( getXPath(e.target).join('/') ); */

    return false
  }
  /**
   * Add event listeners for DOM-inspectorey actions
   */
  if (document.addEventListener) {
    document.addEventListener("click", tabOnClick, true)
  } else if (document.attachEvent) {
    document.attachEvent("click", tabOnClick)
  }
})(document)

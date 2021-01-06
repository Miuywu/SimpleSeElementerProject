var address;

chrome.tabs.query({active: true, currentWindow: true}, function(tabs) {
  var tab = tabs[0];
  var title = "title"
  //var title = tab.title;

  console.log("Title: " + title);
  address = title;
  return address
  //print_address(address);
});

export function getUrl() {
  return address
}

function _getCurrentTab(callback){ //Take a callback
  var theTab;
  chrome.tabs.query({active:true, currentWindow:true},function(tab){
      callback(tab); //call the callback with argument
  });
};

function _displayTab(tab){ //define your callback function
  return tab;
};

var tabUrl = _getCurrentTab(_displayTab);

var uurl;
chrome.runtime.onMessage.addListener((message, sender) => {
  uurl = sender.tab.id;
});

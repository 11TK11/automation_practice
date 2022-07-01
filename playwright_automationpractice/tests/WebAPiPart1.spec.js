const {test, expect, request} = require('@playwright/test');
const {APIUtils} = require("./Utils/APIUtils");

let token;
test.beforeAll(async ({browser})=>{
    const context = await browser.newContext();
    const page = context.newPage();

    const apiContext = await request.newContext();
    const apiUtils=new APIUtils(apiContext);
    console.log(apiUtils.getBoards());
    token="da4438c7babc0245ac9d420b4c8f6905758560d946cf1e142989a854bc8d92f9";
    
    await apiContext.storageState({path: 'state.json'}); //storesinformation on json
    const webContext = await browser.newContext({storageState:'storage.json'});

    const page1 = await webContext.newPage();//create page using past data can be used instead login script later
});
test.only("login without ui", async({page})=>{

      //inser value on localstorage
      page.addInitScript(value=>{
       window.localStorage.setItem('token',value)
     }, token);

     await page.goto("https://trello.com");
     const apiContext = await request.newContext();
    // no need to login from ui after using past lines
      const resp = await apiContext.post("https://api.trello.com/1/lists?name=TESTLIST001&idBoard=62b9aa5c7132732edafaf7d2&key=446cbc1d6532c596ddc610207ead5576&token=da4438c7babc0245ac9d420b4c8f6905758560d946cf1e142989a854bc8d92f9"
      ,{
      data:{},
      headers: {'Authorization': token,
                 'Content-Type':'application/json'}});
      console.log(resp);
      expect(resp.ok()).toBeTruthy();
      console.log(resp);
      await page.pause();
      /*,
      /*data:{},
      headers: {'Authorization': token,
                 'Content-Type':'application/json'});*/
     
});
const {test, expect, request} = require('@playwright/test');
let token;
test.beforeAll(async ()=>{
    const apiContext = await request.newContext();
    const resp = await apiContext.get('https://api.trello.com/1/tokens/');
    /**
     * ,{data: {}}
     */
    expect(resp.ok()).toBeTruthy();
    console.log(resp);
    const jsonRsponse = await resp.json();
    console.log(jsonRsponse);
});
test.only("login without ui", async({page})=>{
    /**
     * inser value on localstorage
     * page.addInitScript(value=>{
     *  window.localStorage.setItem('token',value)
     * }, token);
     * 
     * await page.goto();
     * // no need to login from ui after using past lines
     */
});
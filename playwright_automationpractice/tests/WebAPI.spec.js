const {test, expect, request} = require('@playwright/test');
let webContext;
let token;

test.beforeAll(async()=>{
    const loginPayLoad = {"userEmail":"anshika@gmail.com","userPassword":"Iamking@000"};
    const apiContext = await request.newContext();
    const loginResponse =  await  apiContext.post("https://rahulshettyacademy.com/api/ecom/auth/login",
    {
        data:loginPayLoad
     } )//200,201,
    console.log(loginResponse);
    expect(loginResponse.ok()).toBeTruthy();
    const loginResponseJson = await loginResponse.json();
    token = loginResponseJson.token;

});
/*
test.beforeAll(async({browser})=>{
    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto("https://www.rahulshettyacademy.com/client/");
    await page.locator("#userEmail").fill("anshika@gmail.com");
    await page.locator("#userPassword").fill("Iamking@000");
    await page.locator("[value='Login']").click();
    await page.waitForLoadState("networkidle");

    await context.storageState({path:'sta.json'});
     webContext = await browser.newContext({storageState:'sta.json'});
}

);*/
test.only("t",async()=>{
    const page = webContext.newPage();
    await page.goto("https://www.rahulshettyacademy.com/client/");
    const products = await page.locator(".card-body").allTextContents();
    console.log(products);
    const count = 10;
    for(let i=0;i<count;++i)
    {
      console.log(i);
    }
});

test("t 1",async()=>{
    const page = webContext.newPage();
    await page.goto("https://www.rahulshettyacademy.com/client/");
    const products = await page.locator(".card-body").allTextContents();
    console.log(products);
    
});
test("login no ui", async({page})=>{
    page.addInitScript(value=>{
        window.localStorage.setItem('token',value)
      }, token);
    
      await page.goto("https://www.rahulshettyacademy.com/client/");
      const products = await page.locator(".card-body").allTextContents();
      console.log(products);
      const count = 10;
      for(let i=0;i<count;++i)
      {
        console.log(i);
      }
      
});
const {test, expect, request} = require('@playwright/test');



test.only("screee",async({browser})=>{
    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto("https://www.rahulshettyacademy.com/client/");
    await page.locator("#userEmail").screenshot({path:'scree1.png'})
    await page.locator("#userEmail").fill("anshika@gmail.com");
    await page.locator("#userPassword").fill("Iamking@000");
    await page.screenshot({path:'scree.png'});
    await page.locator("[value='Login']").click();
    await page.waitForLoadState("networkidle");
}
);
test.only("visual test", async({page})=>{
    await page.goto("https://www.rediff.com/");
    expect(await page.screenshot()).toMatchSnapshot('landing.png');
});
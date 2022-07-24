const {test, expect} = require('@playwright/test');

test('test 1', async ({page}) => {
    await page.goto("https://www.rahulshettyacademy.com/client")
    await page.locator("#userEmail").fill("anshika@gmail.com");
    await page.locator("[type='password']").type('learning');
    await page.locator("[value='Login']").click();
    // for service web app
    await page.waitForLoadState('networkidle');  //wait all network calls
    const titles = await page.locator(".card-body b").allTextContents();
    console.log(titles);
});
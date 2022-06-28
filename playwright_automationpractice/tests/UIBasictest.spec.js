const {test, expect} = require('@playwright/test');

test.only('browser context tcs', async ({browser}) => {

    // this is using only browser
    const context = await browser.newContext(); //new instance of browser, could have set cookies
    const page = await context.newPage();

    await page.goto("https://rahulshettyacademy.com/loginpagePractice/");
    await page.locator('#username').type('habsdahsbdha');
    await page.locator("[type='password']").type('learning');
    await page.locator('#signInBtn').click();
    await expect(page.locator("[style*='block']").textContent()).toContainText('incorrect text');
});

test('First tcs', async ({page}) => {
    /*
    // this is using only browser
    const context = await browser.newContext(); //new instance of browser, could have set cookies
    const page = await context.newPage();
    */

    // if provide page dirtectly past steps are not needed
    await page.goto("https://google.com");
    console.log(await page.title());
    await expect(page).toHaveTitle("Google");
});
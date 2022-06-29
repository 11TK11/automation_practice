const {test, expect} = require('@playwright/test');

test('browser context tcs', async ({page}) => {
    await page.goto("https://www.rahulshettyacademy.com/loginpagePractise/");
    const userName =  page.locator('#username'); // use variable as locator
    const signInBtn =page.locator('#signInBtn');
    const documentLink = page.locator("[href*='documents-request']");
    const dropdown = page.locator('select.form-control');
    await dropdown.selectOption("consult");
    await page.locator(".radiotextsty").last().click();
    await page.locator("#okayBtn").click();
    await expect(page.locator(".radiotextsty").last()).toBeChecked();

    await page.locator("#terms").click();
    await expect(page.locator("#terms")).toBeChecked();

    await page.locator("#terms").uncheck();
    expect(await page.locator("#terms").isChecked()).toBeFalsy();

    await expect(documentLink).toHaveAttribute("class", "blinkingText");
    //await page.pause(); inspector tool
});
test.only('child windows', async ({browser}) => {
    const context = await browser.newContext(); //new instance of browser, could have set cookies
    const page = await context.newPage();
    await page.goto("https://www.rahulshettyacademy.com/loginpagePractise/");
    const userName =  page.locator('#username'); // use variable as locator
    const signInBtn =page.locator('#signInBtn');
    const documentLink = page.locator("[href*='documents-request']");

    //new page is open needs to wait for the event, as array cause could be multiple windows
    const [newPage] = await Promise.all([
        context.waitForEvent('page'),
        documentLink.click()
    ]);
    const text = await newPage.locator(".red").textContent();
    console.log(text);
});

test('browser context tcs', async ({browser}) => {

    // this is using only browser
    const context = await browser.newContext(); //new instance of browser, could have set cookies
    const page = await context.newPage();

    const userName =  page.locator('#username'); // use variable as locator
    const signInBtn =page.locator('#signInBtn');
    const cardTitles = page.locator(".card-body a");
    

    await page.goto("https://www.rahulshettyacademy.com/loginpagePractise/");
    await userName.type('habsdahsbdha');
    await page.locator("[type='password']").type('learning');
    await signInBtn.click();
    //await expect(page.locator("[style*='block']")).toContainText('incorrect text');
    
    await userName.fill(""); //clean field
    await userName.fill("rahulshettyacademy");

    // no service web app
    await Promise.all([
        page.waitForNavigation(),
        signInBtn.click()
    ]);
    
    console.log(await cardTitles.nth(1).textContent());
    console.log(await cardTitles.first().textContent());
    console.log(await cardTitles.allTextContents());
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

test('test codegen', async ({ page }) => {

  // Go to https://www.google.com/?gws_rd=ssl
  await page.goto('https://www.google.com/?gws_rd=ssl');

  // Click [aria-label="Buscar"]
  await page.locator('[aria-label="Buscar"]').click();

  // Fill [aria-label="Buscar"]
  await page.locator('[aria-label="Buscar"]').fill('asdasdasd');

  // Press Enter
  await page.locator('[aria-label="Buscar"]').press('Enter');
  await expect(page).toHaveURL('https://www.google.com/search?q=asdasdasd&source=hp&ei=jpa7Yq26LZ2L5OUP0M2rgAE&iflsig=AJiK0e8AAAAAYruknhnmqACYyb-PKCUu6W9zszijAgZv&ved=0ahUKEwituc7wrdH4AhWdBbkGHdDmChAQ4dUDCAc&uact=5&oq=asdasdasd&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEIAEMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDoECAAQAzoLCAAQgAQQsQMQgwE6FAguEIAEELEDEIMBEMcBENEDENQCOggIABCxAxCDAToRCC4QgAQQsQMQgwEQxwEQowI6CAguELEDEIMBOggIABCABBCxAzoLCC4QgAQQsQMQgwE6CwguEIAEELEDENQCOgsILhCABBDHARDRAzoLCC4QgAQQxwEQrwE6CAgAEIAEEMkDOgoILhCABBDUAhAKUOUDWOIIYIIUaAFwAHgAgAGQAogBrQ2SAQUwLjUuNJgBAKABAbABAA&sclient=gws-wiz');

  // Click text=Imágenes
  await page.locator('text=Imágenes').click();
  await expect(page).toHaveURL('https://www.google.com/search?q=asdasdasd&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjbrdCErtH4AhUrH7kGHd5tAhEQ_AUoAXoECAIQAw&biw=1280&bih=720&dpr=1');

  // Click .DCxYpf >> nth=0
  await page.locator('.DCxYpf').first().click();
  await expect(page).toHaveURL('https://www.google.com/search?q=asdasdasd&source=lmns&bih=720&biw=1280&hl=en-US&sa=X&ved=2ahUKEwitn4yHrtH4AhU0CdQKHbfxDbgQ_AUoAHoECAEQAA');

});
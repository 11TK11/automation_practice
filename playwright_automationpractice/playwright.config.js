// @ts-check
const { devices } = require('@playwright/test');

const config = {
  testDir: './tests',
  retries:3,
  //workers:1, //at most by default 5
  /* Maximum time one test can run for. */
  timeout: 30 * 1000,
  expect: {
    /**
     * Maximum time expect() should wait for the condition to be met.
     * For example in `await expect(locator).toHaveText();`
     */
    timeout: 5000
  },
  reporter: 'html',
  /* Shared settings for all the projects below. See https://playwright.dev/docs/api/class-testoptions. */
  use: {
    //all metadata tests
    browserName: 'chromium', //chromium,chrome firefox,firefox webkit,safari
    headless: false,
    screenshot: 'only-on-failure',  //on for any step
    ignoreHttpsErrors:true,
    permissions:['geolocation'],
    trace: 'retain-on-failure',  //log information on,off
    //viewport: {width:720, height:720}
    ...devices['Galaxy Note II'],
  },
  /**
   * projects:[{
   * name:projName,
   * use: {
    browserName: 'chromium', //chromium,chrome firefox,firefox webkit,safari
    headless: false,
    screenshot: 'only-on-failure',  //on for any step
    trace: 'retain-on-failure'  //log information on,off
  }
   * }}, {}]
   */
};

module.exports = config;
/**
 * npx playwright test --config plawwright.config1.js --project=projName
 */
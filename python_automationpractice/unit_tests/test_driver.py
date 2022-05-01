import pytest
from python_automationpractice.framework.utils.ui_support.Browser_Selection import Browser_Selection
from python_automationpractice.framework.utils.ui_support.Browser_Drivers import *

browsers = [('Chrome'), ('Firefox')]

@pytest.mark.parametrize('browser', browsers)
def test_browser_driver(browser):
    web_driver = Browser_Selection()
    browser_instance = web_driver.get_browser(browser)
    assert browser_instance != None
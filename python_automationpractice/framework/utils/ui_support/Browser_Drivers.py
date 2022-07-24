from selenium import webdriver
from selenium.webdriver.firefox.firefox_binary import FirefoxBinary
from python_automationpractice.framework.utils.ui_support.Abstract_Browser import Abstract_Browser

class Chrome_Driver(metaclass=Abstract_Browser):
    web_driver = None

    def __init__(self) -> None:
        self.web_driver = webdriver.Chrome('..\\automation_practice\\ThirdParty\\chromedriver_win32_97.0.4692.71\\chromedriver.exe')
        self.web_driver.implicitly_wait(30)
        self.web_driver.maximize_window()
    
    def get_driver(self):
        return self.web_driver

class Firefox_Driver(metaclass=Abstract_Browser):
    web_driver = None

    def __init__(self) -> None:
        # not working now

        self.web_driver = webdriver.Firefox('..\\automation_practice\\ThirdParty\\geckodriver_v0.30.0_win64\\geckodriver.exe')
        self.web_driver.implicitly_wait(30)
        self.web_driver.maximize_window()
    
    def get_driver(self):
        return self.web_driver
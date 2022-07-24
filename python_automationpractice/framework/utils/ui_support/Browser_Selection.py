from webbrowser import Chrome



from python_automationpractice.framework.utils.ui_support.Browser_Drivers import *

class Browser_Selection:
    browsers = {'Chrome': Chrome_Driver, 'Firefox': Firefox_Driver}

    def get_browser(self, browser):
        return self.browsers[browser]().get_driver()
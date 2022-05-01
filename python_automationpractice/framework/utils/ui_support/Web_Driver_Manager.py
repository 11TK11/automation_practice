from selenium.webdriver.support.ui import WebDriverWait
class SingletonMeta(type):
    """
    The Singleton class can be implemented in different ways in Python. Some
    possible methods include: base class, decorator, metaclass. We will use the
    metaclass because it is best suited for this purpose.
    """

    _instances = {}

    def __call__(cls, *args, **kwargs):
        """
        Possible changes to the value of the `__init__` argument do not affect
        the returned instance.
        """
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwargs)
            cls._instances[cls] = instance
        return cls._instances[cls]

class Web_Driver_Manager(metaclass=SingletonMeta):
    web_driver = None
    wait = None
    wait_time = 30
    def __init__(self) -> None:
        self.web_driver = Browser_Selection().get_browser('Chrome')
        self.wait = WebDriverWait(self.web_driver, self.wait_time)
    
    def get_driver(self):
        return self.web_driver

    def get_wait(self):
        return self.wait
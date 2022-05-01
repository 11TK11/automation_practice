import abc

class Abstract_Browser(abc.ABCMeta):
    @abc.abstractclassmethod
    def get_webdriver(self):
        pass
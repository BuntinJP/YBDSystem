
import os
from selenium import webdriver
from selenium.webdriver.chrome.options import Options

from time import sleep


dir = os.getcwd()
os.chdir(os.path.dirname(os.path.abspath(__file__)))

###########################################################################################################

options = Options()
options.add_argument("--user-data-dir=C:\\Users\\aokit\\Desktop\\YBDSystem\\src\\profile")
options.add_argument("--profile-directory=Profile1")
options.add_argument("--lang=jp")
path = "C:\\Users\\aokit\\Desktop\\YBDSystem\\src\\chromedriver.exe"
driver = webdriver.Chrome(executable_path=path, options=options)
driver.get("https://google.com")

###########################################################################################################

os.chdir(dir)


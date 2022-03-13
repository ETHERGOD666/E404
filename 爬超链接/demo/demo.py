from urllib.request import urlopen

from bs4 import BeautifulSoup
import time

html = urlopen("https://zh.wikipedia.org/wiki/%E5%94%90%E7%B4%8D%C2%B7%E5%B7%9D%E6%99%AE#%E4%BA%BA%E5%90%8D")
bs = BeautifulSoup(html)
hyperlink = bs.find_all('a')

file = open('./result.txt', 'w')

for h in hyperlink:
    if h in hyperlink:
        hh = h.get('href')
        if hh and '/wiki/' in hh:
            print(hh)
            file.write(hh)
            file.write('\n')
            time.sleep(0.01)

file.close()

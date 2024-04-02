from bs4 import BeautifulSoup
import requests
import pandas as pd
import sys
sys.stdout.reconfigure(encoding='utf-8')

url = 'http://www.cgv.co.kr/movies/'
res = requests.get(url)
soup = BeautifulSoup(res.text, 'html.parser')

# 영화 제목 가져오기
titles = soup.find('div', class_='wrap-movie-chart')
titless = titles.find_all('strong', class_='title')
title_name = [title.text for title in titless]

# 인기 영화 10개 출력
print("상영 중인 인기 영화 10개")
for i in range(min(10, len(title_name))):
    print("%d 번째 영화 : %s" % (i + 1, title_name[i]))

# 예매율 및 개봉일 가져오기
box = soup.find('div', class_='sect-movie-chart')
percent = box.find_all('strong', class_='percent')
percent_list = [per.text[3:] for per in percent]

dates = box.find_all('span', class_='txt-info')
dates_list = [date.text.strip()[:10] for date in dates]

# 데이터프레임 생성
movie_df = pd.DataFrame({
    "영화 제목": title_name,
    "예매율": percent_list,
    "개봉일": dates_list
})

# 상위 10개의 행만 표시하며, 인덱스를 1부터 시작하여 순위 표시
top_10_movies = movie_df.head(10).reset_index(drop=True)
top_10_movies.index += 1

print(top_10_movies)

num=int(input())
measurement=[]      # 전체 신체기록 

for i in range(num):
    measure_list=[]     # 개인 신체기록
    weight, height = map(int, input().split())
    measure_list.append(weight)
    measure_list.append(height)
    measurement.append(measure_list)
    
for i in measurement:
    rank = 1
    for j in measurement:
        if(i[0]<j[0] and i[1]<j[1]):
            rank+=1
    print(rank, end=" ")    
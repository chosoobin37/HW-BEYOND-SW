num=int(input())
arr=[]

for i in range(num):
    arr.append(int(input()))
dasom=arr[0]
dasom_out=arr[1:]

ppl_count=0
dasom_out.sort()

if num == 1:
    print(0)
else:
    while dasom<=max(dasom_out):
        dasom_out[-1] -= 1
        dasom += 1
        ppl_count += 1
        dasom_out.sort()
    print(ppl_count)

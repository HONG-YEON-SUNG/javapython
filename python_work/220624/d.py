from mycal import add
from mycal import sub
from mycal import mul
from mycal import div
#from mycal import * << 이거 쓰면 파일에 있는 함수 다 가져옴


result1 = add(10,3)
print('result1 = ',result1)

def main():
    result = add(10,3)
    print('result = ',result)
    result = sub(10,3)
    print('result = ',result)
    result = mul(10,3)
    print('result = ',result)
    result = div(10,3)
    print('result = ',int(result))
main()
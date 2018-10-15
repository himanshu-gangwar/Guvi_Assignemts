def primerange(sr,er):
    for i in range(sr+1,er,1):
        pw=2**i
        fer=pw-2
        if(fer%i==0):
            print(i," ")
        else:
            continue

def main():
    s=int(input("Enter starting range"))
    e=int(input("Enter ending range"))
    primerange(s,e)
    
if __name__=="__main__":
    main()
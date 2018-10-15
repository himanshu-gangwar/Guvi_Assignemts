def prime(num):
        pw=2**num
        fer=pw-2
        if(fer%num==0):
            print("Prime no. ")
        else:
            print("Not a Prime no. ")


def main():
    n=int(input("Enter the number to be checked"))
    prime(n)
    
if __name__=="__main__":
    main()
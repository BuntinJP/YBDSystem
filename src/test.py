import pickle,os
def writeListToFile(array,path):
    if not os.path.exists(path):
        os.makedirs(path)
    f = open(path,"x")
    for i in array:
        f.write(i)
    f.close()



    

def writeBinary(object,path):
    with open(path,"wb") as f:
        pickle.dump(object,f)

def loadBinary(path):
    with open(path,"rb") as f:
        return pickle.load(f)




dir = os.getcwd()
os.chdir(os.path.dirname(os.path.abspath(__file__)))

###########################################################################################################

today = loadBinary("binary")
writeListToFile(today,"archive\\2.txt")



###########################################################################################################

os.chdir(dir)
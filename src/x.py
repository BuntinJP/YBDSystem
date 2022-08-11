from importlib import import_module


import os,pickle,datetime,re



dir = os.getcwd()
os.chdir(os.path.dirname(os.path.abspath(__file__)))

###########################################################################################################
def writeBinary(object,path):
    with open("binary","rb") as f:
        binary = pickle.load(f)
    
    with open(path,"wb") as f:
        pickle.dump(object,f)

def loadBinary():
    with open("binary","rb") as f:
        return pickle.load(f)

def preserveToday():
    dt = datetime.datetime.now()
    if not os.path.exists("archive/"+str(dt.month)):
        os.makedirs("archive/"+str(dt.month))
    f = open("archive/"+str(dt.month)+"/"+str(dt.day)+".txt","wb")
    today = loadBinary()

    for i in today:
        f.write(i.encode("utf-8"))
        f.write("\n".encode("utf-8"))


sec = [(1,2),(2,3)]

writeBinary(sec,"binary")
writeBinary(sec,"binary")

print(loadBinary())




###########################################################################################################

os.chdir(dir)
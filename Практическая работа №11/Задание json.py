import requests
import json



import tkinter as tk 
def B():
    q = name.get()
    response = requests.get('https://api.github.com/users/rust')

    f = json.loads(response.text)

    p = dict.fromkeys(['company'], f['company'])
    p2 = dict.fromkeys(['created_at'], f['created_at'])
    p3 = dict.fromkeys(['email'], f['email'])
    p4 = dict.fromkeys(['id'], f['id'])
    p5 = dict.fromkeys(['name'], f['name'])
    p6 = dict.fromkeys(['url'], f['url'])
    jsoN = (p,p2,p3,p4,p5,p6)




    

    if q == 'rust':
        with open('D:\\Users\\rust.json', 'w') as fl:
            json.dump(jsoN,fl)
        


   
    else:
        print('Not findied')

    



window = tk.Tk()
window.geometry('640x480')
window.title("Панель") 
name = tk.Entry(window)
name.grid(padx=140, pady=15)
btn = tk.Button(window, text="кнопка", command=B)
btn.grid(padx=110, pady=15)
window.mainloop()
B()
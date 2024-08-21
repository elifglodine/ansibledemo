# generate_inventory.py
import os

def generate_inventory():
    # Code to generate the inventory file
    with open('inventory.ini', 'w') as f:
        f.write('[webservers]\n')
        f.write('webserver1 ansible_host=192.168.1.101\n')
        f.write('\n[databases]\n')
        f.write('dbserver1 ansible_host=192.168.1.102\n')

if __name__ == "__main__":
    generate_inventory()
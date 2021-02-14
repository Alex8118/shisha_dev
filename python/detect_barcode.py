import pyzbar.pyzbar as pyzbar
import cv2
from sys import argv
import pandas as pd

# script, first, second, third = argv

def decode_to_int(path):
    """
    Find barcodes and QR codes
    path: путь к файлу
    """
    im = cv2.imread(path)
    decodedObjects = pyzbar.decode(im)
    barcode = int(decodedObjects[0][0])
    # print(barcode)

    return barcode

path = ''
# barcode_int = decode_to_int(first)
barcode_int = decode_to_int(path='IMG_9077.jpg')
print(barcode_int)
# df = pd.read_csv('tastes.csv')
# print(df)
# print(df.loc[df['barcode'] == barcode_int, :])


# Строка для терминала
# detect_barcode.py --path='IMG_9077.jpg'

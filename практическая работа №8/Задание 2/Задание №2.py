def D(a):
    b = ''
    while a != 0:
        b = str(a%8) + b
        a //= 8
    return '{0:0>10}'.format(b)
print(D(17))
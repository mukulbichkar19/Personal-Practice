""" Fibonnaci """

def get_fib(position):
    if position == 0 or position == 1:
        return position
    else:
        return get_fib(position-1) +  get_fib(position-2)

  
return get_fib(4)  

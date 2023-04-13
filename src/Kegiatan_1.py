class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def is_empty(self):
        return not self.items

def reverse_string(input_str):
    stack = Stack()
    output_str = ""

    for char in input_str:
        stack.push(char)

    while not stack.is_empty():
        output_str += stack.pop()

    return output_str


input_str = input("Masukkan string yang akan dibalik: ")
reversed_str = reverse_string(input_str)
print("String setelah dibalik: ", reversed_str)
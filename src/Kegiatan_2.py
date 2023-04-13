class Node:
    def __init__(self, data=None, next_node=None):
        self.data = data
        self.next_node = next_node

class Queue:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def enqueue(self, data):
        new_node = Node(data)
        if self.isEmpty():
            self.head = new_node
        else:
            self.tail.next_node = new_node
        self.tail = new_node
        self.size += 1

    def dequeue(self):
        if self.isEmpty():
            return None
        data = self.head.data
        self.head = self.head.next_node
        if self.head is None:
            self.tail = None
        self.size -= 1
        return data

    def peek(self):
        if self.isEmpty():
            return None
        return self.head.data

    def isEmpty(self):
        return self.size == 0

    def size(self):
        return self.size

playlist = Queue()


while True:
    video = input("Masukkan nama video atau ketik 'selesai' untuk keluar: ")
    if video == "selesai":
        break
    playlist.enqueue(video)

print("Isi playlist:")
node = playlist.head
while node is not None:
    print(node.data)
    node = node.next_node

# Menghapus video dari antrian
video = playlist.dequeue()
print("Video yang dihapus dari antrian / diputar: ", video)

# Melihat isi antrian setelah penghapusan
print("Isi playlist:")
node = playlist.head
while node is not None:
    print(node.data)
    node = node.next_node

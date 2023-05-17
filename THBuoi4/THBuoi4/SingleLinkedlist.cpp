#include <cstddef>
#include <iostream>
using namespace std;
class Node {
public:
	int data;
	Node* next;
};
void pust(Node** headref, int newdata) {
	Node* newnode = new Node();
	newnode->data = newdata;
	newnode->next = (*headref);
	(*headref) = newnode;
}
void insertAfter(Node* prevnode, int newdata) {
	if (prevnode == NULL) {
		cout << "prevnode khong the null";
		return;
	}
	Node* newnode = new Node();
	newnode->data = newdata;
	newnode->next = prevnode->next;
	prevnode->next = newnode;
}
void append(Node** head_ref, int newdata) {
	Node* newnode = new Node();
	Node* last = *head_ref;
	newnode->data = newdata;
	newnode->next = NULL;

	if (head_ref == NULL) {
		*head_ref = newnode;
		return;
	}
	while (last->next != nullptr) {
		last = last->next;
	}
	last->next = newnode;
	return;
}
void printList(Node* node) {
	while (node != NULL) {
		cout << " " << node->data;
		node = node->next;
	}
}
int main() {
	Node* head = NULL;
	append(&head, 6);
	pust(&head, 1);
	insertAfter(head->next, 2);
	printList(head);
	return 0;
}
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct contact {
    char name[20];
    char phone[15];
    char address[30];
};


struct node {
    int hash_value;
    struct node *right_child;
    struct node *left_child;
    struct contact contact;
};


struct contact *searchNode(struct node *root, int x) {
    if (root == NULL || root->hash_value == x)
        return &root->contact;
    else if (x > root->hash_value)
        return searchNode(root->right_child, x);
    else
        return searchNode(root->left_child, x);
}


void searchHash(struct node *root, int x) {
    if (root == NULL)
        printf("Contact not found\n");
    else if (root->hash_value == x)
        printf("Contact found: Name: %s, Phone: %s, Address: %s\n", root->contact.name, root->contact.phone, root->contact.address);
    else if (x > root->hash_value)
        searchHash(root->right_child, x);
    else
        searchHash(root->left_child, x);
}


struct node *getMinimum(struct node *root) {
    if (root == NULL)
        return NULL;
    else if (root->left_child != NULL)
        return getMinimum(root->left_child);
    return root;
}


struct node *newNode(int x, struct contact contact) {
    struct node *p;
    p = malloc(sizeof(struct node));
    p->hash_value = x;
    p->contact = contact;
    p->left_child = NULL;
    p->right_child = NULL;
    return p;
}

struct node *insertNode(struct node *root, int x, struct contact contact) {
    if (root == NULL)
        return newNode(x, contact);
    else if (x > root->hash_value)
        root->right_child = insertNode(root->right_child, x, contact);
    else
        root->left_child = insertNode(root->left_child, x, contact);
    return root;
}

struct node *deleteNode(struct node *root, int x) {
    if (root == NULL)
        return NULL;
    if (x > root->hash_value)
        root->right_child = deleteNode(root->right_child, x);
    else if (x < root->hash_value)
        root->left_child = deleteNode(root->left_child, x);
    else {
        if (root->left_child == NULL && root->right_child == NULL) {
            free(root);
            return NULL;
        } else if (root->left_child == NULL || root->right_child == NULL) {
            struct node *temp;
            if (root->left_child == NULL)
                temp = root->right_child;
            else
                temp = root->left_child;
            free(root);
            return temp;
        } else {
            struct node *temp = getMinimum(root->right_child);
            root->hash_value = temp->hash_value;
            root->right_child = deleteNode(root->right_child, temp->hash_value);
        }
    }
    return root;
}


int hash(const char *string) {
    int hash = 0;
    for (int i = 0; string[i] != '\0'; i++) {
        hash = 31 * hash + string[i];
    }
    return hash;
}

void newContact(struct node *nameTree, struct node *numberTree, char name[], char address[], char phone[]) {
    struct contact new_contact;
    strcpy(new_contact.name, name);
    strcpy(new_contact.address, address);
    strcpy(new_contact.phone, phone);
    insertNode(nameTree, hash(name), new_contact);
    insertNode(numberTree, hash(phone), new_contact);
}

void searchName(struct node *nameTree, char name[]) {
    searchHash(nameTree, hash(name));

}

void searchNumber(struct node *numberTree, char number[]) {
    searchHash(numberTree, hash(number));
}

void removeNumber(struct node *nameTree, struct node *numberTree, char number[]) {
    struct contact n = *searchNode(numberTree, hash(number));
    deleteNode(nameTree, hash(n.name));
    deleteNode(numberTree, hash(n.phone));
}

void removeName(struct node *nameTree, struct node *numberTree, char name[]) {
    struct contact n = *searchNode(nameTree, hash(name));
    deleteNode(nameTree, hash(n.name));
    deleteNode(numberTree, hash(n.phone));
}

int main() {
    struct contact root = {"NULL", "NULL", "NULL"};
    struct node *nameTree;
    nameTree = newNode(-1, root);
    struct node *numberTree;
    numberTree = newNode(-1, root);

//    Add new contacts
//    newContact(nameTree, numberTree, NAME, ADDRESS, PHONE)
    newContact(nameTree, numberTree, "Person1", "Address1", "Phone1");
    newContact(nameTree, numberTree, "Person2", "Address2", "Phone2");
    newContact(nameTree, numberTree, "Person3", "Address3", "Phone3");
    newContact(nameTree, numberTree, "Person4", "Address4", "Phone4");
    newContact(nameTree, numberTree, "Person5", "Address5", "Phone5");

//    Search contacts by name3
//    searchName(nameTree, "PERSON");
    searchName(nameTree, "Person5");
    searchName(nameTree, "Person3");
    searchName(nameTree, "Person1432"); // Not Found

//    searchNumber(numberTree, "NUMBER");
    searchNumber(numberTree, "Phone4");
    searchNumber(numberTree, "Phone2");
    searchNumber(numberTree, "Phone1432"); //Not Found

//    Remove number then search
//    removeNumber(nameTree, numberTree, "NUMBER");
    searchNumber(numberTree, "Phone2");
    removeNumber(nameTree, numberTree, "Phone2");
    searchNumber(numberTree, "Phone2"); // Not found
    searchName(nameTree, "Person2"); // Not found

// Remove name then search
//    removeName(nameTree, numberTree, "Name");
    searchName(nameTree, "Person4");
    removeName(nameTree, numberTree, "Person4");
    searchName(nameTree, "Person4"); //Not Found
    searchNumber(numberTree, "Number4"); //Not Found


    return 0;
}

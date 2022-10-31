package com.crexative.todolistapp.ui.todo_list

import com.crexative.todolistapp.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTotoClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}

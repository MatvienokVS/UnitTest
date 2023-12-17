package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private BookRepository mockRepository;
    private BookService bookService;

    @Before
    public void setUp() {
        // Инициализация мок-объекта
        mockRepository = mock(BookRepository.class);

        // Создание экземпляра BookService с мок-объектом
        bookService = new BookService(mockRepository);
    }

    @Test
    public void testGetBookCount() {
        // Устанавливаем поведение мок-объекта
        when(mockRepository.getCount()).thenReturn(5);

        // Вызываем метод, который использует bookRepository
        int result = bookService.getBookCount();

        // Проверяем, что метод getCount() был вызван ровно один раз
        verify(mockRepository, times(1)).getCount();

        // Проверяем, что результат соответствует ожидаемому значению
        assertEquals(5, result);
    }

}

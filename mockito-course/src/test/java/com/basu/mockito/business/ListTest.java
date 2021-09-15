package com.basu.mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSize_returnMultipleValues() {

		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());

	}

	@Test
	public void letsMockListGet() {

		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("in28min");
		assertEquals("in28min", listMock.get(0));
		assertEquals("in28min", listMock.get(1));

	}

	@Test(expected = RuntimeException.class)
	public void letsMockList_ThrowAnException() {

		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(0);

	}

	@Test(expected = RuntimeException.class)
	public void letsMockList_MixingException() {

		List listMock = mock(List.class);
		when(listMock.subList(anyInt(), 5)).thenThrow(new RuntimeException("Something"));
		listMock.get(0);

	}

	@Test
	public void letsMockListGet_usingBDD() {

		// given
		List<String> listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("in28min");

		// when
		String fistElement = listMock.get(0);

		// then
		assertThat(fistElement, is("in28min"));

	}

}

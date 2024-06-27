package br.com.alura.screammatch.service;

public interface IConverteDados {
  <T> T  obterDados(String json, Class<T> classe);

}

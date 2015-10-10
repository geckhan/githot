package com.knight.arch.module;

import java.util.List;

import dagger.ObjectGraph;

public  interface Injector {
  public  List<Object> getModules();

  public  void inject(Object target);

  public  ObjectGraph plus(Object[] modules);
}

package Mts.Crud.Services;

import java.util.List;

import Mts.Crud.Dto.CategoryDto;

public interface CategoryService {
 CategoryDto save(CategoryDto dto);

  CategoryDto findById(Integer id);

  CategoryDto findByCode(String code);

  List<CategoryDto> findAll();

  void delete(Integer id);

}

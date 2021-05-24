import {Injectable} from '@angular/core';
import {Dictionary} from './Dictionary';
import {filter} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DictionaryPageService {

  constructor() {
  }

  dictionaryList: Dictionary[] = [{
    id: 1,
    english: 'homework',
    vietnamese: 'Bài tập về nhà, Việc nhà',
    description: 'Thể hiện việc cần làm khi ở nhà trong thời dịch'
  },
    {
      id: 2,
      english: 'take care',
      vietnamese: 'Chăm sóc, quan tâm',
      description: 'Thể hiện quan tâm chăm sóc từ người này đến người khác thông qua'
    },
    {
      id: 3,
      english: 'cake',
      vietnamese: 'Bánh',
      description: 'Bánh là danh từ miêu tả các thức ăn ngọt làm từ tinh bột'
    }];

  getAll(): Dictionary[] {
    return this.dictionaryList;
  }


  createDictionaryEntry(dictionary: Dictionary) {
    if (this.dictionaryList.length === 0) {
      dictionary.id = 1;
    } else {
      dictionary.id = this.dictionaryList[this.dictionaryList.length - 1].id + 1;
    }
    return this.dictionaryList.push(dictionary);
  }

  getDictionaryEntry(id: number) {
    return this.dictionaryList[id - 1];
  }

  editDictionaryEntry(dictionary: Dictionary, id: number){
    for (let item of this.dictionaryList){
      if (item.id === dictionary.id){
        item = dictionary;
      }
    }
  }
}
